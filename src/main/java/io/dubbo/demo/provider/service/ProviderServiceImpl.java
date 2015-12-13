package io.dubbo.demo.provider.service;

import org.springframework.stereotype.Service;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService{

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "dubbo:hello "+name;
	}

}
