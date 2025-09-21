Práctica 1: "Instalación y Funcionamiento de los Entornos Móviles"

Esta aplicación Android está diseñada para demostrar el uso de Activities y Fragments mediante distintos elementos de interfaz de usuario, con un enfoque llamativo, tierno y confiable. Incluye personajes adorables como Pingu y Snoopy, y colores suaves que crean un ambiente agradable para el usuario.

Estructura de la App
La MainActivity contiene cinco Fragments, cada uno enfocado en un tipo específico de elemento de UI:

1. TextFields (EditText): Permite al usuario ingresar información y ver ejemplos interactivos.
En el caso de esta parte es importante mecionar que tendremos que conciderar que ubicaremos la parte del desarrollo en los códigos de DashboardFragment y fragment_dashboard.xml.
<img width="426" height="656" alt="image" src="https://github.com/user-attachments/assets/2f7a6fb9-6cc2-4727-9629-1cbcd1dfaabf" />

- Dentro de esta parte hice diferestes modificaciones para que se pudiera visualizar ell como solicito el correo intitucional del alumno y su contraseña. Así que el alumno debe ingresar los datos y al momento de apretar el boton se visualizara la información que ingreso:

Aquí se ve como se ve antes de visualizar la información.

<img width="351" height="786" alt="Captura de pantalla 2025-09-20 144855" src="https://github.com/user-attachments/assets/2e43fb36-cbdf-4127-a3ee-1595efee1640" />

Y aqui se ve como se imprime la informacion en pantalla, junto con una imagen.

<img width="355" height="786" alt="Captura de pantalla 2025-09-20 144905" src="https://github.com/user-attachments/assets/e9ef1d80-91f7-4625-8a84-4679eacae70c" />

2.Botones (Button, ImageButton): Presenta botones funcionales con efectos visuales para probar acciones.
Aqui hice uso de los códigos de HomeFragment.kt y fragment_home.xml.

<img width="416" height="778" alt="image" src="https://github.com/user-attachments/assets/e6e60d68-ca8a-4bfc-95d0-0fa6fe69e15c" />

Lo primero que se visualizara es un texto que da una breve explicación de lo que hace esta pantalla, junto con un texto que da la bienvenida pero que al momento y un boton debajo de esto. Al igual que una imagen.

<img width="353" height="785" alt="Captura de pantalla 2025-09-20 144638" src="https://github.com/user-attachments/assets/dfde0fb6-2df3-4371-b10c-a4d83b61781c" />

Al seleccionar el boton se cambiara el texto de bienvenida por un mensaje que dara a conecer del cambio, a diferencia de seleccionar la imagen se desplagara otra pequeña imagen debajo del mismo.

<img width="357" height="789" alt="Captura de pantalla 2025-09-20 144838" src="https://github.com/user-attachments/assets/95cf2daa-c41c-43df-b3bc-104b2e27cfc9" />


3.Elementos de selección (CheckBox, RadioButton, Switch): Permite seleccionar opciones y ver respuestas dinámicas.
Para el funcionamiento de esta parte utilizare NotificationsFragment.kt y fragment_notifications.xml

<img width="429" height="856" alt="image" src="https://github.com/user-attachments/assets/c04d4a3a-a6bf-4400-bd14-8683ca89c03e" />

Se le preguntara al usuario si le gusta estudiar la carrera de ISC, si selecciona la checkbox seral que le gusta la carrera y si no la selecciona se le mandara un mensaje de motivacón para que continue.

<img width="360" height="782" alt="Captura de pantalla 2025-09-20 145040" src="https://github.com/user-attachments/assets/67e0fcd6-7116-46a3-ad66-08c496e5bb81" />

Aqui se ve el mensaje de motivación. Para la parte del RadioButton concidere preguntar que sabor de helado prefieren si vainilla o chocolate. 
En este caso el usario selecciono vainilla y se imprime en pantalla la respuesta.

<img width="353" height="783" alt="Captura de pantalla 2025-09-20 145053" src="https://github.com/user-attachments/assets/cd1d8a08-b449-43a7-bdb5-e39d55e0f1b1" />

Si el alumno prefiere el helado de chocolate seleccionara el sabor que mas le guste y se reflejara en la pantalla. Asi mismo en el Switch decidi poner el modo claro y oscuro, que lo vimos en una clase.

<img width="350" height="788" alt="Captura de pantalla 2025-09-20 145105" src="https://github.com/user-attachments/assets/b78a3b3a-af53-4c15-850c-92167dd4bcdb" />

Ahora cambiare el modo de claro a oscuro, esta parte me gusto mucho porque me alegro mucho que lo pude solucionar a pesar de los problemas que presente.

<img width="353" height="787" alt="Captura de pantalla 2025-09-20 145119" src="https://github.com/user-attachments/assets/84a5e738-c860-41d8-b769-31b35fc0df2c" />

4.Listas (RecyclerView o ListView): Muestra contenido organizado en listas con imágenes y títulos.
Aqui hice uso y creacion de un nuevo fragment que tiene el nombre de ListFragment, ListAdapter (que me permite hacer uso de de mi funcionamiento de mi lista) y mi fragment_list.xml

<img width="403" height="830" alt="image" src="https://github.com/user-attachments/assets/e767c3d4-44ce-4d13-ac13-30d758eb1a36" />

Para la parte de las listas solo coloque lo correspondiente a las parte de mi aplicación y una imagen.

<img width="349" height="786" alt="Captura de pantalla 2025-09-20 145137" src="https://github.com/user-attachments/assets/b160562f-bc76-438f-b371-034c366bbf0a" />


5.Elementos de información (TextView, ImageView, ProgressBar): Combina textos, imágenes y barras de progreso de manera creativa e interactiva.
Finalmente para mi ultimo fragment tengo que hacer uso de mis codigos ElementFragment.kt y con fragement_element.xml

<img width="436" height="823" alt="image" src="https://github.com/user-attachments/assets/5a92de59-77dc-47ee-afb4-d607c648b229" />

En esta pantalla se vera un pequeño titulo que hace referencia a lo que se esta viendo, junto con una breve descripcion. Abajo de todo esto esta una progressbar.

<img width="350" height="789" alt="Captura de pantalla 2025-09-20 145148" src="https://github.com/user-attachments/assets/a6b17cd4-a832-48ae-b8a0-6317ecd816b6" />

Al momento de que la barra llega a su 100% entonces de forma automatica aparece una imagen de snoopy en la computadora.

<img width="359" height="790" alt="Captura de pantalla 2025-09-20 145159" src="https://github.com/user-attachments/assets/a6b6ed8b-6665-4b36-b896-143d5c2c28a4" />

Capturas de las pantallas mas relevantes
En esta parte del código correspondiente a MainActivity.kt se puede ver la inclusión de los fragment que permiten la navegación

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/685ad249-e6b5-4ee4-a001-ed4ff8f34f96" />

Luego tengo el manejo de los colores que utilice.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/6bf9489f-fcc9-4305-a1dc-b5f27efd2854" />

Mi barra de navegacion.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/61bf2764-839e-4bc5-b5ca-a1f40948321b" />

El cambio de colores para mi barra de navegacion.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/84ea8aae-38d6-47b8-98a3-0d645f91a4df" />

La inclusion de mis vectores e imagenes.

<img width="491" height="565" alt="image" src="https://github.com/user-attachments/assets/a563eb72-18ae-4082-930c-0006243579e1" />

Y el cambio de mi barra superior.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/44773989-6e8f-4c3c-ae81-561dcad213c9" />

Dificultades
1. En mi caso presente difultades al momento de crear mis fragments ya que no recordaba como hacerlos, pero con ayuda de la primera tarea pude guiarme para que me quedara y logarar recordar el procedimiento que segui para que funcionara.
2. Otra dificultad que presente fue cambiar el modo de claro por oscuro, pero lo solucuone porque la vez que el profesor explico este tema tome notas que me ayudaron a solucionar mi problema.
3. Uno basico pero que se me complico fue cambiar el color de mi barra superior e inferior pero lo solucione buscando codigo por codigo hasta que me diera el bueno.

Hallazgos 
Conforme hemos ido desarrollando estas aplicaciones e descubierto que me gusta mucho esta area, porque me gusta que mis proyectos queden lindos.
