# department-store
Grandes almacenes

Implementa un programa que permita gestionar unos grandes almacenes. Unos grandes almacenes están compuestos por:

    Nombre

    Dirección

    Sección de electrónica

    Sección de ropa

    Sección general

Cada sección vende productos del tipo de su sección, la sección general vende todo tipo de productos. Cada sección tiene:

    Planta

    Nombre del gerente

    Listado de productos

Los productos tienen:

    Id de producto

    Precio

    Unidades

    Además hay varios tipos de producto:

        Ropa

            Tipo (camiseta, pantalón, jersey...)

            Talla

            Marca

        Electrónica

            Tipo (ordenador, televisor...)

            Nombre del modelo

            Fabricante

    Todos los productos deben tener un método info() que muestre todos los datos del mismo

Componentes:

    Readers: basados en random

    MainApp:

        Mostrar todos los productos de electrónica (incluyendo los que pueda haber en la planta general)

        Mostrar todos los productos de ropa (incluyendo los que pueda haber en la planta general)

        Mostrar todos los productos