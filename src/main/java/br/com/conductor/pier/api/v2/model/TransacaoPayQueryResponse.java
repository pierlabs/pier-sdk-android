package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de consultar cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de consultar cart\u00C3\u00A3o")
public class TransacaoPayQueryResponse  {
  
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Resultado de consulta de conta
   **/
  @ApiModelProperty(value = "Resultado de consulta de conta")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Mensagem descrevendo resposta.
   **/
  @ApiModelProperty(value = "Mensagem descrevendo resposta.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPayQueryResponse {\n");
    
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


