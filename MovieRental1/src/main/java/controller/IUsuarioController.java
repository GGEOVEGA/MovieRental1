
package controller;


public interface IUsuarioController {
    public String login(String username, String contrasena);
    public String register(String username, String contrasena, String nombre, String apellido, String email, double saldo, boolean premium);
    public String pedir(String username);
    public String restarDinero(String username, double nuevoSaldo);
    
}
