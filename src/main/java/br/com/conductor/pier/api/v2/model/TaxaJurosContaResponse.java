package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TaxaJurosContaListaResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{taxa_juros_conta_response_description}}}
 **/
@ApiModel(description = "{{{taxa_juros_conta_response_description}}}")
public class TaxaJurosContaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTabelaJuros")
  private Long idTabelaJuros = null;
  @SerializedName("taxasJuros")
  private List<TaxaJurosContaListaResponse> taxasJuros = null;

  
  /**
   * {{{taxa_juros_conta_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_juros_conta_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{taxa_juros_conta_response_id_tabela_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_juros_conta_response_id_tabela_juros_value}}}")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * {{{taxa_juros_conta_response_taxas_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_juros_conta_response_taxas_juros_value}}}")
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


