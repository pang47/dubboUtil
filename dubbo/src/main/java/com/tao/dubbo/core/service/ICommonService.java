package com.tao.dubbo.core.service;

import com.tao.dubbo.core.entry.InputObject;
import com.tao.dubbo.core.entry.OutputObject;

public interface ICommonService {
	OutputObject invoke(InputObject input);
}
