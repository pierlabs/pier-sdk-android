package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma conta.
 **/
@ApiModel(description = "Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma conta.")
public class ContaAtribuirCartaoPrePagoRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idPessoaFisica")
  private Long idPessoaFisica = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id).")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Portador (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Portador (id).")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaAtribuirCartaoPrePagoRequest {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
