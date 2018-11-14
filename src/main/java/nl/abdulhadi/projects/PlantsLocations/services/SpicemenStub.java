package nl.abdulhadi.projects.PlantsLocations.services;

import org.springframework.stereotype.Component;

import nl.abdulhadi.projects.PlantsLocations.dto.SpicemenDto;

@Component
public class SpicemenStub implements SpicemenStubInterface {

	
	/* (non-Javadoc)
	 * @see nl.abdulhadi.projects.PlantsLocations.services.SpicemenStubInterface#getSpicemen(int)
	 */
	@Override
	public SpicemenDto getSpicemen(int id) {
		SpicemenDto spicemenDto = new SpicemenDto();
		spicemenDto.setId(id);
		spicemenDto.setDescription("Description for the first item");
		return spicemenDto;
	}

}
