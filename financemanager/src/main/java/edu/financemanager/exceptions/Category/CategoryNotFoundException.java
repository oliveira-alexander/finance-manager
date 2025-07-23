package edu.financemanager.exceptions.Category;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(){ super("Categoria não encontrada!"); }
    public CategoryNotFoundException(String message){ super(message); }
}
