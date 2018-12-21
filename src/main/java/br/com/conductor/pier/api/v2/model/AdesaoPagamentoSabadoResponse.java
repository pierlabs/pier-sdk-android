package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents an adhesion of payment on saturdays
 **/
@ApiModel(description = "Represents an adhesion of payment on saturdays")
public class AdesaoPagamentoSabadoResponse  {
  
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;

  
  /**
   * Adhesion register date
   **/
  @ApiModelProperty(value = "Adhesion register date")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Adhesion due date
   **/
  @ApiModelProperty(value = "Adhesion due date")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Adhesion id
   **/
  @ApiModelProperty(value = "Adhesion id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Account id
   **/
  @ApiModelProperty(value = "Account id")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPagamentoSabadoResponse {\n");
    
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
