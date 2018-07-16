package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{valida_c_v_v_request_description}}}
 **/
@ApiModel(description = "{{{valida_c_v_v_request_description}}}")
public class ValidaCVVRequest  {
  
  @SerializedName("idChaveCriptografia")
  private Long idChaveCriptografia = null;
  @SerializedName("cvv")
  private String cvv = null;

  
  /**
   * {{{valida_c_v_v_request_id_chave_criptografia_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_c_v_v_request_id_chave_criptografia_value}}}")
  public Long getIdChaveCriptografia() {
    return idChaveCriptografia;
  }
  public void setIdChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
  }

  
  /**
   * {{{valida_c_v_v_request_cvv_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_c_v_v_request_cvv_value}}}")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCVVRequest {\n");
    
    sb.append("  idChaveCriptografia: ").append(idChaveCriptografia).append("\n");
    sb.append("  cvv: ").append(cvv).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


