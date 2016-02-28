
package uni.sistemas.entity;

public class Empleado {
  // atributos
    private String idempleado;
    private String Nombres;
    private String Apellidos;
    private String FechaDeIngreso;
    private String Cargo;
    private String Area;
    private String Sueldo;
    
    //constructor

    public Empleado() {
    }

    public Empleado(String idempleado, String Nombres, String Apellidos, String FechaDeIngreso, String Cargo, String Area, String Sueldo) {
        this.idempleado = idempleado;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaDeIngreso = FechaDeIngreso;
        this.Cargo = Cargo;
        this.Area = Area;
        this.Sueldo = Sueldo;
    }
    
    

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(String FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }
    

    
    
    
}
