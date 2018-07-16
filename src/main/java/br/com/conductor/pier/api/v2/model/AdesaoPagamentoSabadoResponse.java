package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{adesao_pagamento_sabado_resposta_descricao}}}
 **/
@ApiModel(description = "{{{adesao_pagamento_sabado_resposta_descricao}}}")
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
   * {{{adesao_pagamento_sabado_resposta_data_cadastro_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pagamento_sabado_resposta_data_cadastro_descricao}}}")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{adesao_pagamento_sabado_resposta_data_vencimento_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pagamento_sabado_resposta_data_vencimento_descricao}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{adesao_pagamento_sabado_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pagamento_sabado_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{adesao_pagamento_sabado_resposta_id_conta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pagamento_sabado_resposta_id_conta_descricao}}}")
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


