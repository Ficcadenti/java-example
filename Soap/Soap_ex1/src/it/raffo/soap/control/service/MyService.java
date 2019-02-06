package it.raffo.soap.control.service;

import java.util.Arrays;

import it.raffo.soap.model.pojo.Input;
import it.raffo.soap.model.pojo.Output;

public class MyService
{

	public String echo(String message)
	{
		return "Echo " + message;
	}

	public Output sort(Input input)
	{
		Arrays.sort(input.getVector());
		return new Output(input.getVector());
	}
}