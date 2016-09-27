package top.yellowbig.info;

import java.util.Properties;

import javax.servlet.Filter;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;


public class Activator extends DependencyActivatorBase{

	@Override
	public void destroy(BundleContext arg0, DependencyManager arg1)
			throws Exception {

	}

	@Override
	public void init(BundleContext context, DependencyManager Dependency)
			throws Exception {
		Properties props = new Properties();
		props.put("pattern", "/*.*");
		Dependency.add(createComponent().setInterface(Filter.class.getName(),
				props).setImplementation(VerifyFilter.class));
		Dependency.add(createComponent().setInterface(Object.class.getName(), null)
				.setImplementation(InfoRest.class));
	}

}
