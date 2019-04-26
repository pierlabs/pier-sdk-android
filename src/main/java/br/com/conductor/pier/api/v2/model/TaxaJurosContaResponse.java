package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TaxaJurosContaListaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta da taxa de juros
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta da taxa de juros")
public class TaxaJurosContaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTabelaJuros")
  private Long idTabelaJuros = null;
  @SerializedName("taxasJuros")
  private List<TaxaJurosContaListaResponse> taxasJuros = null;

  
  /**
   * id_conta
   **/
  @ApiModelProperty(value = "id_conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da tabela de juros
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da tabela de juros")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * Listagem da taxas de juros
   **/
  @ApiModelProperty(value = "Listagem da taxas de juros")
  public List<TaxaJurosContaListaResponse> getTaxasJuros() {
    return taxasJuros;
  }
  public void setTaxasJuros(List<TaxaJurosContaListaResponse> taxasJuros) {
    this.taxasJuros = taxasJuros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTabelaJuros: ").append(idTabelaJuros).append("\n");
    sb.append("  taxasJuros: ").append(taxasJuros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
