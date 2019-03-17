package com.dp.creational.abstractfactory.gcp;

import com.dp.creational.abstractfactory.Instance;
import com.dp.creational.abstractfactory.ResourceFactory;
import com.dp.creational.abstractfactory.Storage;
import com.dp.creational.abstractfactory.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
