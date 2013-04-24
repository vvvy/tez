/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.tez.dag.utils;

import org.apache.hadoop.fs.Path;
import org.apache.tez.dag.api.TezConfiguration;

public class DAGApps {

  private static final String STAGING_CONSTANT = ".staging";
  public static Path getStagingAreaDir(TezConfiguration conf, String user) {
    return new Path(conf.get(TezConfiguration.DAG_AM_STAGING_DIR,
        TezConfiguration.DAG_AM_STAGING_DIR_DEFAULT)
        + Path.SEPARATOR + user + Path.SEPARATOR + STAGING_CONSTANT);
  }
  
}
