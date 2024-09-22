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


Este método utiliza la clase Calendar para obtener la hora actual y establecer un mensaje de saludo en función de si es mañana, tarde o noche.
Diseño XML

xml

<LinearLayout
    android:orientation="vertical"
    android:gravity="center">
    
    <TextView
        android:id="@+id/greetingTextView"
        android:text="¡Bienvenido!"
        android:textSize="24sp" />
    
    <Button
        android:id="@+id/buttonGoToMain"
        android:text="Ir a la actividad principal" />
</LinearLayout>

Este diseño XML organiza los elementos de la interfaz de manera simple y vertical, con un TextView para el saludo y un botón para navegar a la siguiente actividad.

## 4. ActivityPrincipal

### Descripción
`ActivityPrincipal` es la actividad donde el usuario puede ingresar su nombre y verlo reflejado en la pantalla. También permite navegar a la `ActivityConfiguracion` para cambiar el color de fondo de la aplicación.

### Código Clave

```java
buttonGuardarNombre.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String nombre = editTextNombre.getText().toString();
        textViewNombre.setText("Nombre ingresado: " + nombre);
    }
});


Este fragmento de código obtiene el texto ingresado por el usuario y lo muestra en el TextView correspondiente.
Diseño XML

xml

<LinearLayout
    android:orientation="vertical"
    android:gravity="center">
    
    <EditText
        android:id="@+id/editTextNombre"
        android:hint="Ingresa tu nombre" />
    
    <Button
        android:id="@+id/buttonGuardarNombre"
        android:text="Guardar Nombre" />
    
    <TextView
        android:id="@+id/textViewNombre"
        android:textSize="18sp" />
    
    <Button
        android:id="@+id/buttonGoToConfiguracion"
        android:text="Ir a Configuración" />
</LinearLayout>

En esta interfaz, se utiliza un EditText para la entrada del nombre, seguido de un botón para guardarlo y un TextView para mostrar el nombre ingresado.
## 5. ActivityConfiguracion

### Descripción
`ActivityConfiguracion` es la pantalla que permite al usuario cambiar el color de fondo de la aplicación. El usuario puede elegir entre los colores rojo, verde y azul, y también volver a la pantalla principal.

### Código Clave

```java
buttonColorRojo.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        layoutConfiguracion.setBackgroundColor(Color.RED);
    }
});

Diseño XML

xml

<LinearLayout
    android:id="@+id/layoutConfiguracion"
    android:orientation="vertical"
    android:gravity="center">
    
    <TextView
        android:text="Elige un color de fondo:" 
        android:textSize="24sp"/>
    
    <Button
        android:id="@+id/buttonColorRojo"
        android:text="Rojo" />
    
    <Button
        android:id="@+id/buttonColorVerde"
        android:text="Verde" />
    
    <Button
        android:id="@+id/buttonColorAzul"
        android:text="Azul" />
    
    <Button
        android:id="@+id/buttonVolver"
        android:text="Volver a la pantalla de inicio" />
</LinearLayout>

La disposición vertical organiza los botones para seleccionar un color de fondo, y hay un botón adicional para volver a la actividad anterior.
## 6. Interacciones entre las actividades

La aplicación utiliza la clase `Intent` para navegar entre actividades. Por ejemplo, desde `MainActivity`, se inicia `ActivityPrincipal`, y desde allí, el usuario puede navegar a `ActivityConfiguracion`.

### Código Clave

```java
Intent intent = new Intent(MainActivity.this, ActivityPrincipal.class);
startActivity(intent);
## 7. Conclusión

Esta aplicación Android básica ofrece una experiencia personalizada al usuario mediante un saludo dinámico, la posibilidad de ingresar su nombre y cambiar el color de fondo. El código es modular y organizado, con tres actividades principales que interactúan entre sí de manera eficiente.

## 8. Bibliografía

- Documentación oficial de Android: [https://developer.android.com](https://developer.android.com)
- Guía de diseño de interfaces de usuario en Android
- Referencia de Java para Android
