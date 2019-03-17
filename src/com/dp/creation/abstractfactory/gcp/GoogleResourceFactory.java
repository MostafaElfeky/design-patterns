package com.dp.creation.abstractfactory.gcp;

import com.dp.creation.abstractfactory.Instance;
import com.dp.creation.abstractfactory.ResourceFactory;
import com.dp.creation.abstractfactory.Storage;
import com.dp.creation.abstractfactory.Instance.Capacity;

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
