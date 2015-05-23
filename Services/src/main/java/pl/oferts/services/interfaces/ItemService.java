package pl.oferts.services.interfaces;

import pl.oferts.services.dto.CreateItemDTO;

/**
 * Created by karol on 23.05.15.
 */
public interface ItemService {

     Long createNewItem(CreateItemDTO newItemDTO);
}
