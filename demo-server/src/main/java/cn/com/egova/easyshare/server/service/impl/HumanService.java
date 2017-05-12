/**
 * Copyright 1999-2014 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.egova.easyshare.server.service.impl;

import cn.com.egova.easyshare.common.entity.Human;
import cn.com.egova.easyshare.server.service.IHumanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 人员相关操作
 */
@Service
public class HumanService implements IHumanService {

    private static final Logger logger = LoggerFactory.getLogger(HumanService.class);

    /**
     * 根据ID查找人员信息
     *
     * @param humanId
     * @return
     * @throws Exception
     */
    public Human getHuman(int humanId) throws Exception {
        Human h = new Human();
        h.setHumanName("demo");
        h.setDescription("human desc");
        return h;
    }
}
