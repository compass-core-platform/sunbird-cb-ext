package org.sunbird.workallocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.sunbird.common.model.Response;
import org.sunbird.workallocation.model.SearchCriteria;
import org.sunbird.workallocation.model.WorkAllocationDTOV2;
import org.sunbird.workallocation.model.WorkOrderDTO;
import org.sunbird.workallocation.service.AllocationServiceV2;

import java.io.IOException;

@RestController
@RequestMapping("/v2/workallocation")
public class AllocationControllerV2 {

    @Autowired
    private AllocationServiceV2 allocationServiceV2;

    @PostMapping("/add")
    public ResponseEntity<Response> addWorkAllocation(@RequestHeader("Authorization") String authUserToken,
                                                      @RequestHeader("userId") String userId, @RequestBody WorkAllocationDTOV2 workAllocation) {
        return new ResponseEntity<>(allocationServiceV2.addWorkAllocation(authUserToken, userId, workAllocation),
                HttpStatus.OK);
    }

    @PostMapping("/add/workorder")
    public ResponseEntity<Response> addWorkOrder(@RequestHeader("userId") String userId, @RequestBody WorkOrderDTO workOrder) {
        return new ResponseEntity<>(allocationServiceV2.addWorkOrder(userId, workOrder),
                HttpStatus.OK);
    }

    @PostMapping("/update/workorder")
    public ResponseEntity<Response> updateWorkOrder(@RequestHeader("userId") String userId, @RequestBody WorkOrderDTO workOrder) {
        return new ResponseEntity<>(allocationServiceV2.updateWorkOrder(userId, workOrder),
                HttpStatus.OK);
    }

    @PostMapping("/getWorkOrders")
    public ResponseEntity<Response> getWorkOrders(@RequestBody SearchCriteria searchCriteria) {
        return new ResponseEntity<>(allocationServiceV2.getWorkOrders(searchCriteria),HttpStatus.OK);
    }

    @GetMapping("/getWorkOrderById/{workOrderId}")
    public ResponseEntity<Response> getWorkOrderById(@PathVariable("workOrderId") String workOrderId) throws IOException {
        return new ResponseEntity<>(allocationServiceV2.getWorkOrderById(workOrderId),HttpStatus.OK);
    }

    @GetMapping("/copy/workOrder/{workOrderId}")
    public ResponseEntity<Response> copyWorkOrder(@RequestHeader("userId") String userId, @PathVariable("workOrderId") String workOrderId){
        return new ResponseEntity<>(allocationServiceV2.copyWorkOrder(userId, workOrderId),
                HttpStatus.OK);
    }

    @GetMapping("/user/basicInfo/{userId}")
    public ResponseEntity<Response> getUserBasicInfo(@PathVariable("userId") String userId) throws IOException {
        return new ResponseEntity<>(allocationServiceV2.getUserBasicDetails(userId), HttpStatus.OK);
    }

}
