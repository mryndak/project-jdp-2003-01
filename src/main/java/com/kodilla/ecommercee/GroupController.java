package com.kodilla.ecommercee;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ecommercee/group")
public class GroupController {
    @GetMapping(value = "getGroups")
    public List<GroupDto> getGroups() {
        return new ArrayList<>();
    }

    @PostMapping(value = "createGroup")
    public boolean createGroup(GroupDto groupDto) {
        return true;
    }

    @PutMapping(value = "updateGroup")
    public GroupDto updateGroup(Long groupId) {
        return new GroupDto(groupId, "car", "vehicles");
    }

    @GetMapping(value = "getGroup")
    public GroupDto getGroup(Long groupId) {
        return new GroupDto(1L, "Cars", "Vehicles likecars");
    }
}
