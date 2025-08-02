package edu.financemanager.controllers;

import edu.financemanager.data.ApiResponse;
import edu.financemanager.dtos.transaction.TransactionCreateDTO;
import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.dtos.transaction.TransactionFilterDTO;
import edu.financemanager.dtos.transaction.TransactionUpdateDTO;
import edu.financemanager.interfaces.TransactionService;
import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/transaction")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public ResponseEntity<ApiResponse<List<TransactionDTO>>> find(@ModelAttribute TransactionFilterDTO filter)
    {
        List<TransactionDTO> list = service.find(filter);

        ApiResponse<List<TransactionDTO>> response = new ApiResponse<>();
        response.setData(list);
        response.setMessage(null);

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<TransactionDTO>> insert(@RequestBody TransactionCreateDTO transaction)
    {
        TransactionDTO dto = service.create(transaction);
        ApiResponse<TransactionDTO> response = new ApiResponse<>();
        response.setData(dto);
        response.setMessage("Transação adicionada com sucesso!");

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @PutMapping
    public ResponseEntity<ApiResponse<TransactionDTO>> update(@RequestBody TransactionUpdateDTO transaction)
    {
        TransactionDTO dto = service.update(transaction);
        ApiResponse<TransactionDTO> response = new ApiResponse<>();
        response.setData(dto);
        response.setMessage("Transação alterada com sucesso!");

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable long id)
    {
        service.delete(id);
        ApiResponse<Void> response = new ApiResponse<>();
        response.setMessage("Transação com ID" + id + " removida com sucesso!");

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

}
