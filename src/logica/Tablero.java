package logica;
import java.util.ArrayList;
import java.util.Random;


public class Tablero {

	private int[][]  tablero;
	private int[][]  referenciasCol;
	private int[][]  referenciasFila;
	
	public Tablero()
	{
		
		
		
		this.tablero = new int[5][5];
				
		this.referenciasCol = new int[5][3];
		
		this.referenciasFila = new int [5][3];
		
		
		
		System.out.println("Terminado");
	}
	
	private static void generarTablero(int[][] tablero)
	{
		//Para 5x5 un 50% es decir 12,5, redondeamos a 13, casillas rellenas es ideal
		int _largoTablero = tablero[0].length;
		
		int[] _patronAleatorio = randomSinRepetir(_largoTablero);
		
		int _totalCasillasNegras = Math.round((_largoTablero * _largoTablero) * 0.5f);
		
		int _casillasNegrasDisponibles = _totalCasillasNegras;
		
		int _maximo = 0; int _minimo = 0;
		
		Random random = new Random();
		
		for (int i = 0; i<_largoTablero; i++)
		{
			
			if(_totalCasillasNegras / 2 <  _casillasNegrasDisponibles)
			{
				_maximo = 4; _minimo = 1;
			}
			
			else _maximo = 2; _minimo = 1;
			
			int _resto = rellenarTablero(tablero[_patronAleatorio[i]], _totalCasillasNegras, _maximo, _minimo, random);
			
			_casillasNegrasDisponibles -= _resto;
				
			
		}
		
		imprimirMatriz(tablero);

	}
	
	private static int rellenarTablero(int[] fila, int casillasNegrasDisponibles, int maximo, int minimo, Random rand)
	{	
		
		
		int _cantNegras = rand.nextBoolean() ? maximo : minimo;
		
		
		System.out.println(_cantNegras);
		
		ArrayList<Integer> _posicionesDisponibles = new ArrayList<>();
		
		for (int i = 0; i < fila.length; i++) 
		{
		    _posicionesDisponibles.add(i);
		}

		// Elegir N posiciones aleatoriamente
		for (int i = 0; i < _cantNegras; i++) 
		{
		    int _indiceAleatorio = rand.nextInt(_posicionesDisponibles.size());
		    int _posicionElegida = _posicionesDisponibles.remove(_indiceAleatorio);
		    fila[_posicionElegida] = 1;
		}	
		return _cantNegras;
	}

	private static int[] randomSinRepetir(int largoDeMatriz)
	{		
		ArrayList<Integer> _indicesDisponibles = new ArrayList<Integer>();
	
		int[] _patronAleatorio = new int[largoDeMatriz];
		
		for (int i = 0; i<largoDeMatriz; i++)
		{
			_indicesDisponibles.add((Integer)(i));
		}
		
		System.out.println(_indicesDisponibles);
		
		Random _random = new Random();
		
		int _posicionActual = 0;
		while (_indicesDisponibles.size() != 0)
		{
			int _indexAleatorio = _random.nextInt(_indicesDisponibles.size());
			
			int _elementoSeleccionado = _indicesDisponibles.get(_indexAleatorio);
			
		    _patronAleatorio[_posicionActual] = _elementoSeleccionado;
			
			_indicesDisponibles.remove(_indexAleatorio);
			
			System.out.println(_indicesDisponibles);
			
			_posicionActual ++;
		}
		
	    return _patronAleatorio;
    }
	
	public static void imprimirMatriz(int[][] mat)
	{
		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        System.out.print(mat[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}
	
	private void validarTablero(int[][] tablero)
	{
		
	}
	
	public boolean corregirRespuesta(int [][] respuesta)
	{
		if(respuestaCorrecta(respuesta)) return true;
		
		else return  false;
	}
	
	private boolean respuestaCorrecta(int [][] respuesta)
	{
		return true;
	}
	
	
	

	
	
	
		
	}


