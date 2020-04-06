package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartItemDto;
import com.kodilla.ecommercee.domain.Group;
import com.kodilla.ecommercee.domain.GroupDto;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ecommercee/group")
public class GroupController {

    @RequestMapping(method = RequestMethod.GET, value = "getGroups")
    public List<GroupDto> getGroups() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getGroup")
    public GroupDto getGroup(@RequestParam Long id) {
        return new GroupDto(1l, "Phones", "description");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteGroup")
    public void deleteGroup(@RequestParam Long id) {
        System.out.println("Group has been deleted");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateGroup")
    public GroupDto updateGroup(@RequestBody GroupDto groupDto) {
        return new GroupDto(2l, "TV", "test");

    }

    @RequestMapping(method = RequestMethod.POST, value = "createGroup")
    public void createGroup(@RequestBody GroupDto groupDto) {
        System.out.println("Group has been created");
    }
}
