package net.lr.ds.hello;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class HelloComponent {
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Activate
	public void start() {
		log.info("Hello World");
	}
}
