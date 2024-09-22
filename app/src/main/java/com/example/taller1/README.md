# Documentación del Proyecto: Aplicación Android

## 1. Introducción
Este proyecto es una aplicación Android básica que proporciona una interfaz de usuario para la personalización de la experiencia mediante un saludo personalizado, la introducción del nombre del usuario y la posibilidad de cambiar el color de fondo. La aplicación incluye tres actividades principales: `MainActivity`, `ActivityPrincipal` y `ActivityConfiguracion`.

## 2. Estructura del Proyecto
El proyecto consta de las siguientes clases y archivos XML:

- **MainActivity**: Pantalla de inicio con saludo personalizado.
- **ActivityPrincipal**: Permite al usuario ingresar su nombre.
- **ActivityConfiguracion**: Pantalla para cambiar el color de fondo.
- **Archivos XML**: Definen la interfaz gráfica de las actividades mencionadas.

## 3. MainActivity

### Descripción
`MainActivity` es la actividad principal que se muestra al abrir la aplicación. Su función es mostrar un saludo personalizado según la hora del día (mañana, tarde, noche). También tiene un botón que permite al usuario navegar hacia la `ActivityPrincipal`.

### Código Clave

```java
private void setGreetingMessage() {
    Calendar calendar = Calendar.getInstance();
    int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

    if (hourOfDay >= 6 && hourOfDay < 12) {
        greetingTextView.setText("Buenos días");
    } else if (hourOfDay >= 12 && hourOfDay < 18) {
        greetingTextView.setText("Buenas tardes");
    } else {
        greetingTextView.setText("Buenas noches");
    }
}
