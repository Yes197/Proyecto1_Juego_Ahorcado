package main;


import java.util.ArrayList;
import jadex.bdiv3.annotation.Belief;
import jadex.bdiv3.features.IBDIAgentFeature;
import jadex.micro.annotation.Agent;
import jadex.micro.annotation.AgentCreated;
import jadex.micro.annotation.AgentFeature;
import jadex.micro.annotation.Description;

@Agent
@Description("Jugador 1")
public class Jugador1 {
	@AgentFeature
	protected IBDIAgentFeature bdifeature;
	
	@AgentCreated
	
	@Belief
	public void PalabrasEspanhol()
	{
	  ArrayList<String> PalabrasEspanhol = new ArrayList<String>();
	  PalabrasEspanhol.add("ceviche");
	  PalabrasEspanhol.add("chanfainita");
	  PalabrasEspanhol.add("pachamanca");
	  PalabrasEspanhol.add("mondonguito");
	  PalabrasEspanhol.add("mazamorra");
	  PalabrasEspanhol.add("juane");
	  PalabrasEspanhol.add("sancochado");
	}
	
	
	
}
