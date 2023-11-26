
package model;

public enum EnumTipoServicio {    

    //Coloco una etiqueta de nombre y un numero como tiempo estimado...
    
    WINDOWS("Windows", 8),
    WINDOWS_SERVER("Windows Server", 12),
    MS_OFFICE("MS Office", 6),
    LIBRE_OFFICE("Libre Office", 6),
    TANGO("Tango", 10),
    SAP("SAP", 14),
    REDES("Redes", 12),
    LINUX_DESKTOP("Linux Desktop", 10),
    SERVER_DEBIAN("Server Debian", 14),
    RHEL("RHEL", 14),
    DATABASE_MANAGER("Database Manager", 16),
    MANTENIMIENTO_HARDWARE("Mantenimiento Hardware", 16),
    IMPRESION_COORPORATIVA("Impresión Corporativa", 8),
    OTROS("Otros", 0);

    private final String nombre;
    private final int tiempoEstimado;

    EnumTipoServicio(String nombre, int tiempoEstimado) {
        this.nombre = nombre;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

// WINDOWS,
// WINDOWS_SERVER,
// MS_OFFICE,
// LIBRE_OFFICE,
// TANGO,
// SAP,
// REDES,
// LINUX_DESKTOP,
// SERVER_DEBIAN,
// RHEL,
// DATABASE_MANAGER,
// MANTENIMIENTO_HARDWARE,
// IMPRESION_COORPORATIVA,
// OTROS;
}
