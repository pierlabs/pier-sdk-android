package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para ades\u00E3o de pagamento no s\u00E1bado
 **/
@ApiModel(description = "Objeto de resposta para ades\u00E3o de pagamento no s\u00E1bado")
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
   * Data do cadastro da ades\u00E3o
   **/
  @ApiModelProperty(value = "Data do cadastro da ades\u00E3o")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Data de vencimento para ades\u00E3o
   **/
  @ApiModelProperty(value = "Data de vencimento para ades\u00E3o")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Id do registro de ades\u00E3o
   **/
  @ApiModelProperty(value = "Id do registro de ades\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id da conta
   **/
  @ApiModelProperty(value = "Id da conta")
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
