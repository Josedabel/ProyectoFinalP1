package code;

import java.sql.Array;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Empresa {
    private ArrayList<Proyecto> misProyectos;
    private ArrayList<Empleado> misEmpleados;
    private ArrayList<Contrato> misContratos;
    private ArrayList<Cliente> misClientes;
    private static Empresa emp = null;
	public Empresa() {
		// TODO Auto-generated constructor stub
		// TODO Auto-generated constructor stub
				super();
				misProyectos = new ArrayList<>();
				misEmpleados= new ArrayList<>();
				misContratos = new ArrayList<>();
				misClientes = new ArrayList<>();
	}
	public static Empresa getInstance(){
		 if(emp == null){
			 emp = new Empresa();
		 }
		 
		 return emp;
	 }
	public ArrayList<Proyecto> getMisProyectos() {
		return misProyectos;
	}
	public void setMisProyectos(ArrayList<Proyecto> misProyectos) {
		this.misProyectos = misProyectos;
	}
	public ArrayList<Empleado> getMisEmpleados() {
		return misEmpleados;
	}
	public void setMisEmpleados(ArrayList<Empleado> misEmpleados) {
		this.misEmpleados = misEmpleados;
	}
	public ArrayList<Contrato> getMisContratos() {
		return misContratos;
	}
	public void setMisContratos(ArrayList<Contrato> misContratos) {
		this.misContratos = misContratos;
	}
	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}
	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}
	
	public void insertProyecto(Proyecto aux){
		misProyectos.add(aux);
	}
	public void insertEmpleado(Empleado aux){
		misEmpleados.add(aux);
	}
	public void insertCliente(Cliente aux){
		misClientes.add(aux);
	}
	public void insertContrato(Contrato aux){
		misContratos.add(aux);
	}
	public Cliente findClienteById(String id) {
		Cliente clien =null;
		boolean find = false;
		int i=0;
		while (i<misClientes.size()&&!find) {
			if(misClientes.get(i).getId().equalsIgnoreCase(id)){
				clien = misClientes.get(i);
				find = true;
			}
			i++;
		}
		return clien;
	}
	public Empleado findEmpleadoById(String id) {
		Empleado emp =null;
		boolean find = false;
		int i=0;
		while (i<misEmpleados.size()&&!find) {
			if(misEmpleados.get(i).getID().equalsIgnoreCase(id)){
				emp = misEmpleados.get(i);
				find = true;
			}
			i++;
		}
		return emp;
	}
	public Contrato findContratoById(String id) {
		Contrato contract =null;
		boolean find = false;
		int i=0;
		while (i<misContratos.size()&&!find) {
			if(misContratos.get(i).getId().equalsIgnoreCase(id)){
				contract = misContratos.get(i);
				find = true;
			}
			i++;
		}
		return contract;
	}
	private int buscarIndexClien(Cliente clien){
		int index = -1;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<misClientes.size()){
			if(misClientes.get(i).getId().equalsIgnoreCase(clien.getId())){
				index = i;
				encontrado = true;
			}
			i++;
		}
		
		return index;
	}
	public void ModificarCliente(Cliente clien){
		int index = buscarIndexClien(clien);
		misClientes.set(index, clien);
	}
	
	private int buscarIndexProyecto(Proyecto pro){
		int index = -1;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<misProyectos.size()){
			if(misProyectos.get(i).getNombre().equalsIgnoreCase(pro.getNombre())){
				index = i;
				encontrado = true;
			}
			i++;
		}
		
		return index;
	}
	public void ModificarProyecto(Proyecto pro){
		int index = buscarIndexProyecto(pro);
		misProyectos.set(index, pro);
	}
	
	private int buscarIndexContrato(Contrato contract){
		int index = -1;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<misContratos.size()){
			if(misContratos.get(i).getId().equalsIgnoreCase(contract.getId())){
				index = i;
				encontrado = true;
			}
			i++;
		}
		
		return index;
	}
	public void ModificarContrato(Contrato contract){
		int index = buscarIndexContrato(contract);
		misContratos.set(index, contract);
	}

	public boolean Prorroga(String codigo, String newFechaFin){
		boolean doProrroga = false;
		
		return doProrroga;
		
	}
	
	
}
