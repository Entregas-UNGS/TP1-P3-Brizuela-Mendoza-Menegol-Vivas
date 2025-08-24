# Programación III - Universidad Nacional de General Sarmiento
# TP1-P3-Brizuela-Mendoza-Menegol-Vivas

## Trabajo Práctico 1: Nonograma

El objetivo del trabajo práctico es implementar una aplicación visual que permita jugar al juego de ingenio llamado **Nonograma**.

El nonograma es un tipo de rompecabezas originario de Japón, que se juega sobre una cuadrícula en blanco y negro. Es un juego de ingenio con reglas simples y soluciones desafiantes. Cada casilla de la cuadrícula puede estar pintada de negro o marcada con una X (celda vacía). Las pistas numéricas, ubicadas a la izquierda de cada fila y sobre cada columna, indican las longitudes y el orden de las secuencias de celdas negras que deben aparecer en esa fila o columna.

### Ejemplo

<!-- Agregar imagen -->

### Reglas

- Se tiene una grilla de casillas de **5×5**, que deben ser pintadas de negro o marcadas con una X.
- En las pistas, cada número indica una cadena de celdas negras consecutivas.
- Entre dos cadenas de celdas negras debe existir al menos una celda libre, en el ejemplo las marcadas con X.
- Al costado de cada fila en la grilla, aparecen los largos de las cadenas de casillas en negro para esa fila.
- Sobre cada columna en la grilla, aparecen los largos de las cadenas de casillas en negro para esa columna.
- El objetivo es encontrar y marcar todas las casillas negras.

**Observación:** Dos cadenas de casillas negras están separadas, al menos, por una X. Una configuración como esta no es una solución válida:

<!-- Agregar imagen -->

---

La aplicación debe contar con una interfaz visual y con los elementos adecuados para realizar las acciones del juego sobre grillas de **5×5**. El jugador debe poder pintar una celda de “negro” (o el color elegido), marcar una celda con “X” (o la forma elegida), y volver a dejar una celda en “blanco”. La interfaz debe permitir manipular la grilla de forma sencilla e intuitiva. Cuando el usuario considere que finalizó, debe enviar a evaluar su solución, y la aplicación debe informarle si ganó o si perdió, y mostrarle la solución correcta.

### Objetivos opcionales (no obligatorios)

1. **Niveles de juego:** Incluir varios niveles de juego, que permitan jugar con grillas de tamaños mayores: 10×10, 15×15, 20×20.
2. **Sistema de pistas limitado:** Permitir que el usuario pida una pista; por ejemplo, revelar una celda negra correcta.
3. **Mostrar la solución:** Dada una configuración incompleta realizada por el usuario, completar la solución si fuera posible o bien informar que con las decisiones tomadas no es posible completar la solución.

---

### Condiciones de entrega

El trabajo práctico se debe entregar por mail a los docentes de la materia. Además del código, se debe incluir un documento en el que se describa la implementación y se detallen las decisiones tomadas durante el desarrollo. El código responsable de la lógica del juego debe estar claramente separado del código responsable de la interfaz. El trabajo práctico se debe hacer en grupos de tres o de cuatro personas.

**Fecha de entrega:** Martes 16 de septiembre.

