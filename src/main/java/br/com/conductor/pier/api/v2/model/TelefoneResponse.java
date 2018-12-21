package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Response of the telephone
 **/
@ApiModel(description = "Object Response of the telephone")
public class TelefoneResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * Identification Code of the Telephone
   **/
  @ApiModelProperty(value = "Identification Code of the Telephone")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Telephone Type
   **/
  @ApiModelProperty(value = "Identification Code of the Telephone Type")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * Identification Code of the Person which the telephone belongs
   **/
  @ApiModelProperty(value = "Identification Code of the Person which the telephone belongs")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * DDD code of the telephon
   **/
  @ApiModelProperty(value = "DDD code of the telephon")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Telephone Number
   **/
  @ApiModelProperty(value = "Telephone Number")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Extension Number
   **/
  @ApiModelProperty(value = "Extension Number")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  
  /**
   * Show the telephone status, where: '0': Inactive and '1': Active
   **/
  @ApiModelProperty(value = "Show the telephone status, where: '0': Inactive and '1': Active")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
