Proceso TestDeEntrada_Equipo_de_Futbol
	Escribir "Datos Historicos del equipo, partido a partido";
	diferenciaDeGoles<-0;
	puntosTotales<- 0;
	puntos <-0;
	cant_partidos<-1;
	ganado<-0;
	empatado<-0;
	perdido<-0;
	golesAFacum<-0;
	golesECacum<-0;
	cant_ganados<-0;
	cant_empatados<-0;
	cant_perdidos<-0;
	golesAFavor<-0;
	golesEnContra<-0;
	Repetir
		puntos<- 0;
		ganado<-0;
		empatado<-0;
		perdido<-0;
		Escribir "Goles a favor partido ",cant_partidos;
		leer golesAFavor;
		Escribir "Goles en contra partido ",cant_partidos;
		leer golesEnContra;
		Si (golesAFavor > golesEnContra) Entonces
			Escribir "Partido Ganado";
			ganado <- ganado +1;
			puntos<- puntos +3;
		SiNo
			Si (golesAFavor = golesEnContra)Entonces
				Escribir "Partido Empatado";
				empatado <- empatado +1;
				puntos <- puntos +1;
			SiNo
				Si (golesAFavor < golesEnContra) Entonces
					Escribir "Partido Perdido";
					perdido <- perdido +1;
				    puntos<- puntos;
					
				FinSi
			FinSi
		FinSi
		golesAFacum <- golesAFacum + golesAFavor;
		golesECacum <- golesECacum + golesEnContra;
		diferenciaDeGoles <- golesAFacum - golesECacum;
		puntosTotales <- puntosTotales + puntos;
		cant_partidos <- cant_partidos + 1;
		cant_ganados<- cant_ganados + ganado;
		cant_empatados<- cant_empatados + empatado;
		cant_perdidos<- cant_perdidos + perdido;
		Limpiar Pantalla;
	Hasta Que (cant_partidos = 11);

	Si (puntos <= 10) Entonces
		Escribir "Estado de Clasificacion: Liguilla de Promocion a Decenso";
	Sino
		Si (puntos > 10 y puntos <=20) Entonces
			Escribir "Estado de Clasificacion: No Liguilla ";
		SiNo
			Escribir "Estado de Clasificacion mayor a 20 puntos: Liguilla de Campeonato" ;
		FinSi
	FinSi
	Escribir "Dentro de los",cant_partidos," partidos en la LIGA Regional";
	Escribir "Los partidos ganados fueron: ",cant_ganados;
	Escribir "Los partidos empatados fueron: ",cant_empatados;
	Escribir "Los partidos perdidos fueron: ",cant_perdidos;
	Escribir "Los goles a favor fueron: ",golesAFacum;
	Escribir "Los goles en contra fueron: ",golesECacum;
	Escribir "La diferencia de goles fue de: ",diferenciaDeGoles;
	Escribir "Los puntos totales fueron de: ",puntosTotales;
FinProceso