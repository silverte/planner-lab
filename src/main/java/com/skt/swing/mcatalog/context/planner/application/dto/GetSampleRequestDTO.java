package com.skt.swing.mcatalog.context.planner.application.dto;

import com.skt.swing.mcatalog.context.planner.domain.core.model.SampleAggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetSampleRequestDTO {

    private String id;

    public SampleAggregate getSampleAggregateForQuery(){
        return new SampleAggregate(this.id);
    }
}