# Antonia Paredes
# Diagrama de clases:

#
Análisis del diagrama de clases:
#
En primer lugar definí como obvias las clases "Persona" y "Vehículo" (pues todos los medios de transporte mencionados serían objetos de esta clase),
luego de esto, pense en no sobrecargar la clase persona con trabajo que no debía hacer la "persona" en sí y agregué la clase "Viaje", donde se "planea e inicia el viaje";
también la clase "Main" solo para iniciae el código y finalmente la clase "Validaciones" para crear en esta las funciones necesarias para validar las entradas de usuario;
Debido a que Viaje realiza las funciones principales, donde interactua el usuario y se escogen los valores para trabajar, depende de las clases persona, vehiculo y validaciones;
Main funciona llamando a la funcion "iniciarViaje" de Viaje, por lo que también existe dependencia.
#
Análisis de diferencias entre implementación anterior y actual:
#
Anteriormente, con la implementación basada sólo en métodos, se hubiese tornado muy largo el trabajo y hubiese sido dificil de encontrar cada método en una sola página;
además los vehículos se hubiesen tenido que programar por separado, haciendo todo de un proceso más engorroso; con la implementación basada en clases, el trabajo se ordena bastante,
pudiendo encontrar errores más facilmente; si bien tarde más en programar el código debido a que no estoy acostumbrada, siento que brinda un resultado mucho mas estructurado.
