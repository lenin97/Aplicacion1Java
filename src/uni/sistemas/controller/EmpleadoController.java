package uni.sistemas.controller;

import java.io.IOException;
import java.util.List;
import uni.sistemas.entity.Empleado;
import uni.sistemas.model.EmpleadoDaoFile;

public class EmpleadoController {

    //variable
    EmpleadoDaoFile dao;
    //constructor

    public EmpleadoController() {
        dao = new EmpleadoDaoFile();
    }

    // metodos de negocio
    public void EmpleadoRegistrar(Empleado o) throws IOException {
        dao.create(o);
    }

    public void EmpleadoActualizar(Empleado o) throws IOException {
        dao.update(o);
    }

    public void EmpleadoEliminar(Empleado o) throws IOException {
        dao.delete(o);
    }

    public List<Empleado> EmpleadoListar() throws IOException {
        return dao.readAll();
    }

    public Empleado[] EmpleadoBuscar(Object o) throws IOException {
        return dao.find(o);
    }
}
