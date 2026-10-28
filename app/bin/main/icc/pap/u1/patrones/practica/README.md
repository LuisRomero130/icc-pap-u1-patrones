## Práctica: Singleton y Factory Method

En `App.java` hice el método `runPractica()` para probar los dos patrones.

**Singleton:** pedí la configuración dos veces con `Configuracion.getGlobal()` y comparé las dos con `==`. Da `true`, o sea que es la misma instancia. Ahí se guarda el impuesto (15 % por defecto).

**Factory Method:** usé dos creadores, `CreadorEnLinea` y `CreadorPresencial`, que crean un `PedidoEnLinea` y un `PedidoPresencial`. No uso `new` directamente en los pedidos, solo llamo a `crearPedido()`.

Al hacer `procesar()` se calcula el total con el impuesto y se genera el comprobante de cada tipo de pedido.

**Cambio de impuesto:** puse el impuesto en 12 % con `setImpuestos(12.0)` y volví a procesar el primer pedido. El total pasó de $115.0 a $112.0, así que todos los pedidos usan la misma configuración.

### Salida

```
------Ejecucion de runPractica-------
Misma instancia: true
Cliente: Ana Subtotal: $100.0 Impuesto: $15.0 Total: $115.0
Comprobante electrónico enviado por correo. Pedido: P001
Cliente: Luis Subtotal: $50.0 Impuesto: $7.5 Total: $57.5
Comprobante impreso entregado en caja. Pedido: P002
--- Cambio de impuesto a 12% ---
Cliente: Ana Subtotal: $100.0 Impuesto: $12.0 Total: $112.0
Comprobante electrónico enviado por correo. Pedido: P001
```