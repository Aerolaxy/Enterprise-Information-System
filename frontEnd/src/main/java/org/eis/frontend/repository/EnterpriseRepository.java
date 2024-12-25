package org.eis.frontend.repository;

import org.eis.frontend.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

    // 根据企业名称模糊查询
    List<Enterprise> findByNameContaining(String name);

    // 根据企业简称模糊查询
    List<Enterprise> findByAbbreviationContaining(String abbreviation);

    // 根据行业和省份查找相关企业（通过 @Query 实现）
    @Query("SELECT e FROM Enterprise e WHERE e.industry = :industry AND e.province = :province")
    List<Enterprise> findRelatedEnterprises(String industry, String province);
}
