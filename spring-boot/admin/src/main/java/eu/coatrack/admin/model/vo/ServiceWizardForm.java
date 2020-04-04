package eu.coatrack.admin.model.vo;

/*-
 * #%L
 * ygg-admin
 * %%
 * Copyright (C) 2013 - 2019 Corizon
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 *
 * @author perezdf
 */
public class ServiceWizardForm {

    private String serviceName;
    private String serviceUrl;
    private Boolean serviceForFree;
    private Boolean monthlyCharge;
    private Boolean percallCharge;
    private String serviceCost;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Boolean getServiceForFree() {
        return serviceForFree;
    }

    public void setServiceForFree(Boolean serviceForFree) {
        this.serviceForFree = serviceForFree;
    }

    public Boolean getMonthlyCharge() {
        return monthlyCharge;
    }

    public void setMonthlyCharge(Boolean monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public Boolean getPercallCharge() {
        return percallCharge;
    }

    public void setPercallCharge(Boolean percallCharge) {
        this.percallCharge = percallCharge;
    }

}
