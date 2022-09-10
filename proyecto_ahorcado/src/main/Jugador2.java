package main;

import java.util.ArrayList;
import antlr.collections.List;
import jadex.micro.annotation.Agent;
import jadex.micro.annotation.AgentCreated;
import jadex.micro.annotation.AgentFeature;
import jadex.micro.annotation.Description;
import jadex.micro.annotation.Implementation;
import jadex.micro.annotation.ProvidedService;
import jadex.micro.annotation.ProvidedServices;
import jadex.micro.examples.ping.IEchoService;

@Description("Jugador 2")
@Agent
@ProvidedServices(@ProvidedService(type=IEchoService.class,
implementation=@Implementation(expression="$pojoagent")))
public class Jugador2<IBDIAgentFeature> {
	@AgentFeature
	protected IBDIAgentFeature bdifeature;
	

	

	
	
}
