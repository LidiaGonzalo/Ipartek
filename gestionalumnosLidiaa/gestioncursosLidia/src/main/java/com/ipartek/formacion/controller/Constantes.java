package com.ipartek.formacion.controller;

public class Constantes {
	private Constantes() {}
	
	
	public final static String ATT_LISTADO_CURSOS= "listado_cursos";
	public final static String ATT_CURSO = "curso";
	
	public final static String ATT_LISTADO_ALUMNOS ="listado_alumnos";
	public final static String ATT_ALUMNO ="alumno";

	
	public final static String ATT_LISTADO_MODULOS = "listado_modulos";
	public final static String ATT_MODULO = "modulo";
		
	public final static String PAR_CODIGO= "codigo";
	public final static String PAR_NOMBRE ="nombre";
	
	public final static String PAR_DNI = "dni";
	public final static String PAR_APELLIDOS = "apellidos";
	public final static String PAR_OPERACION ="operacion";
	//añadir campo fecha a alumnos
	public final static String PAR_MES ="mes";
	public final static String PAR_DIA ="dia";
	public final static String PAR_ANIO ="anio";
	
	
	public final static String SERVLET_CURSOS ="cursos.do";
	public final static String SERVLET_ALUMNOS ="alumnos.do";
	public final static String SERVLET_MODULOS ="modulos.do";
	
	public final static String PAR_GENERO="genero";
	public final static String PAR_IDIOMA ="idioma";
	public final static String PAR_CURSO ="curso";
	
	public final static String JSP_LISTADO_CURSOS ="/cursos/listado.jsp";
	public final static String JSP_CURSO ="/cursos/curso.jsp";
	
	public final static String JSP_LISTADO_ALUMNOS ="/alumnos/listado.jsp";
	public final static String JSP_ALUMNO ="/alumnos/alumno.jsp";
	
	public final static String JSP_LISTADO_MODULOS ="/alumnos/listado.jsp";
	public final static String JSP_MODULO ="/alumnos/alumno.jsp";
	
	public final static int OP_CREATE = 0;
	public final static int OP_READ = 1;
	public final static int OP_UPDATE = 2;
	public final static int OP_DELETE = 3;
}
