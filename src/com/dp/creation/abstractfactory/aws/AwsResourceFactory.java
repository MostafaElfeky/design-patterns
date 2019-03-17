package com.dp.creation.abstractfactory.aws;

import com.dp.creation.abstractfactory.Instance;
import com.dp.creation.abstractfactory.ResourceFactory;
import com.dp.creation.abstractfactory.Storage;
import com.dp.creation.abstractfactory.Instance.Capacity;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
