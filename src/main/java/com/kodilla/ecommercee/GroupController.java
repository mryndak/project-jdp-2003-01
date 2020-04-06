package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GroupDto;
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
    public void createGroup(@RequestBody GroupDto groupDto) {

    }

    @PutMapping(value = "updateGroup")
    public GroupDto updateGroup(@RequestBody GroupDto groupDto) {
        return groupDto;
    }

    @GetMapping(value = "getGroup")
    public GroupDto getGroup(Long groupId) {
        return new GroupDto(1L, "Cars", "Vehicles likecars");
    }
}
