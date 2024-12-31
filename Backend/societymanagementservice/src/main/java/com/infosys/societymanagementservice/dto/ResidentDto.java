package com.infosys.societymanagementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidentDto {
    private String name;
    private String phoneNo;
    private String postal;
    private String societyName;
    private String flatNo;
}