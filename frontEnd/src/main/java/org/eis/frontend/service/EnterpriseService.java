package org.eis.frontend.service;

import org.eis.frontend.model.Enterprise;
import org.eis.frontend.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    // 1. 根据企业名称进行查询
    public List<Enterprise> searchEnterpriseByName(String name) {
        // 根据企业名称进行模糊查询
        return enterpriseRepository.findByNameContaining(name);
    }

    // 2. 根据企业简称进行查询
    public List<Enterprise> searchEnterpriseByAbbreviation(String abbreviation) {
        // 根据企业简称进行模糊查询
        return enterpriseRepository.findByAbbreviationContaining(abbreviation);
    }


    public List<Enterprise> getRelatedEnterprises() {
        return null;
         }

    // 4. 查询企业信息的问答功能（待接入大模型）
    public String getEnterpriseInfoAnswer(String question) {
        // 未来接入大模型API的地方
        return "待接入大模型功能";
    }
}
