package edu.financemanager.exceptions.Category;

public class CategoryAlreadyExistsException extends RuntimeException{
    public CategoryAlreadyExistsException(){ super("A categoria já existe!"); }
    public CategoryAlreadyExistsException(String message) { super(message); }
}
