package com.zhcs.dao;

import com.zhcs.entity.TokenEntity;

//*****************************************************************************
/**
 * <p>Title:TokenDao</p>
 * <p>Description:用户Token</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 深圳市智慧城市管家信息科技有限公司</p>
 * @author 刘晓东 - Alter
 * @version v1.0 2017年5月26日
 */
//*****************************************************************************
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
