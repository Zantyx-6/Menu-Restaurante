# Sistema de Menú Dinámico para Restaurante

## Estructura

- Composite: `MenuComponent`, `MenuCategory`, `MenuItem`
- Proxy: `MenuProxy`
- Strategy: `DescuentoStrategy` y sus implementaciones
- Template Method: `PedidoTemplate` y subclases

## Ejecución

1. Compila todos los archivos Java en `src/`.
2. Ejecuta `Main.java`.
3. Observa ejemplos de menú, descuentos y pedidos.

## Extensibilidad

- Puedes agregar nuevos descuentos creando una clase que implemente `DescuentoStrategy`.
- Puedes crear nuevos tipos de pedido extendiendo `PedidoTemplate`.

## Decisiones de diseño

- Uso de patrones para flexibilidad y mantenibilidad.
- Proxy protege acceso a ítems premium.
- Estrategias de descuento intercambiables.
- Flujo de pedido personalizable.

## Autores

- Lucio Alejandro Moreno 
- Michael Andres Lora

## Instrucciones de entrega

- Incluye capturas de código y UML en el informe PDF.
- Sube el PDF y el repositorio a Moodle.
