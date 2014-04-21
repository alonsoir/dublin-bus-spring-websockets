package standalone.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusDublinController {

	@RequestMapping("/bus")
	public String listBuses() {
		return "bus/list";
	}
}
