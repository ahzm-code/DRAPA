package fr.xxx.xxxx.sbpmn.calcul;

import java.util.ArrayList;

import fr.xxx.xxxx.sbpmn.common.BPMNResources;
import fr.xxx.xxxx.sbpmn.common.Resource;
import fr.xxx.xxxx.sbpmn.deploy.BPMNProcess;

public class CalculTotalCost {
	
	private BPMNProcess bpmnProcess;
	private BPMNResources bpmnResources;
	private ArrayList<Resource> resources;
	private long totalCost; 
	
	public CalculTotalCost(BPMNProcess bpmnProcess, ArrayList<Resource> resources) {
		this.bpmnProcess = bpmnProcess;
		this.resources = new ArrayList<>();
		this.resources.addAll(resources);
		this.totalCost = 0L;
	}
	
	
	private long calculTotalCost() {
		ArrayList<Resource> allResources = new ArrayList<>();
		allResources.addAll(this.resources);
		for(Resource res : allResources) {
			this.totalCost += res.getResourceCost();
		}
		return this.totalCost;
	}
	
	public long getTotalCost() {
		return this.calculTotalCost();
	} 
}
