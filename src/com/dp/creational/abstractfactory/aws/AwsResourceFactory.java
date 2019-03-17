package com.dp.creational.abstractfactory.aws;

import com.dp.creational.abstractfactory.Instance;
import com.dp.creational.abstractfactory.ResourceFactory;
import com.dp.creational.abstractfactory.Storage;
import com.dp.creational.abstractfactory.Instance.Capacity;
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
