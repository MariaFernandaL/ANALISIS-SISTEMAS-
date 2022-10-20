package service;

public interface UserService {

    /**
     * Descripcion: Este metodo es para realizar la creacion de usuarios, su funcionalidad es dada en la clase que lo implemente (UserServiceImpl)
     * @param name
     * @param identification
     * @param address
     * @param phone
     * @param email
     * @param mensaje
     */
    void createUser(String name, String identification, String address, String phone, String email, Mensaje mensaje);

    /**
     * Descripcion: Este metodo es para realizar la eliminación de un usuario, su funcionalidad es dada en la clase que lo implemente (UserServiceImpl)
     * @param identification
     */
    void deleteUser(String identification);

    /**
     * Descripcion: Este metodo es para realizar la actualizacion de un usuario, su funcionalidad es dada en la clase que lo implemente (UserServiceImpl)
     * @param identification
     */
    void updateUser(String identification);

    /**
     * Descripcion: Este metodo es para visualizar todos los usuarios creados o modificados, su funcionalidad es dada en la clase
     * que lo implemente (UserServiceImpl)
     */
    void viewUsers();
}
